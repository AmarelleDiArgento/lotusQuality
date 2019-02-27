/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load', cargarGraficos, false);

var updateInterval = 5000;
setInterval(function () {
    //location.reload();
    cargarGraficos()
}, updateInterval);

function cargarGraficos() {
    var ctx = {};
    var config = {};
    fetch('procesos.json')
        .then((Procesos) => {
            return Procesos.json();
        }).then((Procesos) => {
            for (const p of Procesos.procesos) {

                let Grafico = document.querySelector('#graficas');
                Grafico.innerHTML += `
            <div id="canvas-holder-${p.id}" class="col s12 m6 l4">
                <canvas id="chart-area-${p.id}"></canvas>
            </div>
            `
                var f = 100 - p.cumplimiento;
                config[p.id] = {
                    type: 'doughnut',
                    data: {
                        datasets: [{
                            data: [
                                p.cumplimiento, f
                            ],
                            backgroundColor: [
                                p.color, '#bbbbbb'
                            ],
                            label: 'Dataset 1'
                        }],
                        labels: ['Cumplido', 'Pendiente']
                    },
                    options: {
                        responsive: false,
                        legend: {
                            position: 'center',
                        },
                        title: {
                            display: true,
                            text: p.nombre
                        },
                        animation: {
                            animateScale: true,
                            animateRotate: true
                        }
                    }
                };
            }
            var id = 0;
            for (var i in Procesos.procesos) {
                id++;
                console.log(id);
                console.log('chart-area-' + id);
                ctx[id] = document.getElementById('chart-area-' + id);
                ctx[id].getContext('2d');
                window.myDoughnut = new Chart(ctx[id], config[id]);

            }


        });
}