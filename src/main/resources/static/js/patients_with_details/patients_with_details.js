$(function () {
    var herf=location.search;
    var array = herf.split("=");
    findPatientsById(array[1]);
    //alert(array[1])
    //alert(111)
})
function findPatientsById(id) {
    $.ajax({
        type:'post',
        url:'patientsWithDetailsController/findPatientsById',
        data:{"id":id},
        success:function (data) {
            console.log(data);
        }
    })

}