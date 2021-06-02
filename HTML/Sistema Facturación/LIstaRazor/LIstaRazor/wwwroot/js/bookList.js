var dataTable;

$(document).ready(function () {
    loadDataTable();
})

/*dataTable es el id de la tabla que tendra aplicada el efecto. */
function loadDataTable() {
    dataTable = $('#DT_load').DataTable({
        "ajax": {
            "url": "api/book",
            "type": "GET",
            "datatype": "json"
        }, "columns": [
            { "data": "name", "width": "20%" },
            { "data": "autor", "width": "20%" },
            { "data": "isbn", "width": "20%" },
            {
                "data": "id",
                "render": function (data) {
                    return `
                    <div class="text-center">
                        <a href="/BookList/Edit?id=${data}" class='btn btn-success text-white' style="cursor:pointer;width:70px">
                        Editar 
                        </a>
                    &nbsp;
                        <a  class='btn btn-danger text-white' style='cursor:pointer; width:70px'
                        onclick=Delete('/api/book?id='+${data})>
                        Borrar
                        </a>
                    </div>`;
                }, "width": "40%"
            }
        ], "language": {
            "emptyTable": "no data found"
        },   
        "width": "100%"
    });
}

function Delete(url) {
    swal({
        title: "¿Seguro que deseas eliminar el libro?",
        text: "Una vez eliminado no podras recuperar el registro.",
        icon: "warning",
        buttons: true,
        dangerMode: true
    }).then((willDelete) => {
        if (willDelete) {
            $.ajax({
                type: "DELETE",
                url: url,
                success: function (data) {
                    if (data.success) {
                        dataTable.ajax.reload();

                    } else {
                        toastr.error(data.message);
                    }

                }
            });
        }
    });
}


function printDiv(nombreDiv) {
    var contenido = document.getElementById(nombreDiv).innerHTML;
    var contenidoOriginal = document.body.innerHTML;

    document.body.innerHTML = contenido;

    window.print();

    document.body.innerHTML = contenidoOriginal;
}