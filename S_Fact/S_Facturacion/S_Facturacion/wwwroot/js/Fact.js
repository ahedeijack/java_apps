var dataTable;

$(Document).ready(function () {
    loadDataTable();
})

function loadDataTable() {
    dataTable = $('#data_tab').DataTable({
        "ajax": {
            "url": "/api/ticket",
            "type": "GET",
            "datatype":"json"
        },
        "columns": [
            { "data": "t_nestacion", "width": "15%" },
            { "data": "t_nfolio", "width": "15%" },
            { "data": "t_nwebId", "width": "15%" },
            { "data": "t_fecha", "width": "15%" },
            {
                "data": "t_id",
                "render": function (data) {
                    return `
                        <div class="text-center">
                            <a class='btn btn-danger text-white' style='cursor:pointer width;60px'
                                    onClick=Delete('/api/ticket?t_id='+${data})>
                                    Borrar Ticket
                            </a>
                        </div>`;
                }, "width":"40%"
            }
        ], "language": {
                "emptyTable":"no data found"
        },
        "width":"100%"
    })
}