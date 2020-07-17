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
            $("input[name='name']").val(data.name);
            $("select[name='sex']").val(data.sex);
            $("input[name='born']").val(data.born);
            $("select[name='nationality']").val(data.nationality);
            $("input[name='stature']").val(data.stature);
            $("input[name='weight']").val(data.weight);
            $("input[name='bmi']").val(data.bmi);
            console.log(data);
        }
    })

}