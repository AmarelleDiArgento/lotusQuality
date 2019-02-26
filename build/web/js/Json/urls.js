/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
let stat;

fetch('roles.json')
        .then((Roles) => {
            return Roles.json();
        }).then((Roles) => {
    let tab = document.querySelector('#rols');
    tab.innerHTML = '';
    tab.innerHTML +=
            `
                        <tr>
                        <form class="col s12" method="get" action="roles.json">
                            <td></td>
                            <td><input placeholder="Nombre" name="nombre" type="text" class="validate" required=""></td>
                            <td><input placeholder="Descripcion" name="descripcion" type="text" class="validate" required=""></td>
                            <td><input placeholder="Estado" name="estado" type="text" class="validate" required=""></td>
                            <td colspan="2">
                                <input name="accion" value="Registrar" type="submit" class="modal-action waves-effect waves-light btn-flat">
                            </td>
                        </form>
                        </tr>
   `;
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


