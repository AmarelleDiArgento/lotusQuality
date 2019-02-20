<%--
    Document   : rol
    Created on : 18/02/2019, 05:19:00 PM
    Author     : almoreno
--%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Parallax Template - Materialize</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection" />
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection" />
        <script>
            var Rols;
            let stat;
            fetch('roles.json')
                    .then((Roles) => {
                        return Roles.json();
                    }).then((Roles) => {
                let tab = document.querySelector('#rols');
                tab.innerHTML = '';
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
        </script>

    </head>

    <body>
        <h1>Hola :D</h1>
        <div class="container">
            <table>
                <thead>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Estado</th>
                <th>Editar</th>
                <th>Eliminar</th>
                </thead>
                <tbody id="rols">

                </tbody>
            </table>
        </div>

    </body>

</html>