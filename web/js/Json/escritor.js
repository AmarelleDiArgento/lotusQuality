function escribir(file, data) {
    console.log("escribir:" + data);
    localStorage.setItem(file, data);
};

function leer(file) {

    var json = localStorage.getItem(file);
    console.log(json);
    
};
