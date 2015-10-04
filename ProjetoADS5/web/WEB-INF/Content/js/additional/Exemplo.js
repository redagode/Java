$(document).ready(function () {
    $.ajax({
        url: "http://localhost/ProjetoADS5/Listar?id=1",
        dataType: "json",
        success: function (item) {
            alert(item.id + " - " + item.nome);
        },
        error: function () {
            alert("erro");
        }
    });
});
