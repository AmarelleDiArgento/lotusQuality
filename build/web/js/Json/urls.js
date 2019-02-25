/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var Rols;
let stat;

fetch('roles.json')
        .then((Roles) => {
            return Roles.json();
        }).then((Roles) => {
    let tab = document.querySelector('#rols');
    tab.innerHTML = '';
    tab.innerHTML +=
            `
    <form class="col s12">
            <tr>
              <td></td>
              <td><input placeholder="Nombre" id="nombre" type="text" class="validate"></td>
              <td><input placeholder="Descripcion" id="descripcion" type="text" class="validate"></td>
              <td><input placeholder="Estado" id="estado" type="text" class="validate"></td>
              <td colspan="2">

                <button class="btn" value="Enviar">Enviar</button>
</td>
            </tr>
    </form>`;
    for (let r of Roles.roles) {
        console.log(r);
        if (r.estado) {
            stat = `<i class="small material-icons green-text">radio_button_checked</i>`;
        } else {
            stat = `<i class="small material-icons grey-text">radio_button_unchecked</i>`;
        }

        tab.innerHTML +=
                `
            <tr>
              <td>` + r.id + `</td>
              <td>` + r.nombre + `</td>
              <td>` + r.descripcion + `</td>
              <td>` + stat + `</td>
              <td><i class="small material-icons ">edit</i></td>
              <td><i class="small material-icons">delete</i></td>
            </tr>`;
    }
});


