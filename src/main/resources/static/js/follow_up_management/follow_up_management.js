var fp;
$(function () {
    findFollowUpGroupAndHospitalDepartment();
    followUpManagementFenYe(1);
})
function followUpManagementFenYe(pageNum) {
    aaa();
    var formData2 = $("#form2").serialize();
    var list = [];
    $("#list_view input[type=checkbox]").each(function () {
        if ($(this).is(':checked')){
            list.push($(this).val());
        }
    })

    formData2+='&pageNum='+pageNum+'&list='+list;
   /* if (followUpSetdate != null){
        formData2+='&followUpSetdate='+followUpSetdate;
    }*/
    console.log(formData2)
    $.ajax({
        type:'post',
        url:'followUpManagementController/findAllFollowUpManagement',
        data:formData2,
        success:function (data) {
            fp=data;
            var result = data.list;
            $("#tbody").empty();
            var a = '';
            for (var i=0;i<result.length;i++){
                a+='<tr>';
                a+='<td>'+result[i].patientUnique+'</td>';
                a+='<td>'+result[i].followUpName+'</td>';
                a+='<td>'+result[i].patientName+'</td>';
                if (result[i].sex==1){
                    a+='<td>男</td>';
                }else if (result[i].sex==2){
                    a+='<td>女</td>';
                }
                a+='<td>'+result[i].patientId+'</td>';
                a+='<td>'+result[i].setOfDate+'</td>';
                a+='<td>'+result[i].dateOfNextFollowUp+'</td>';
                switch (result[i].followUpSetdate) {
                    case 0:
                        a+='<td>未随访</td>';
                        break;
                    case 1:
                        a+='<td>已随访</td>';
                        break;
                }
                a+='<td><img class="img" onclick="tiaozhuan('+result[i].patientId+')" src="img/u167.png"/></td>';
                a+='</tr>';
            }
            $("#tbody").append(a);
//console.log(data);
        }
    })
}
function findFollowUpGroupAndHospitalDepartment() {

    $.ajax({
        type: 'post',
        url:'followUpManagementController/findFollowUpGroupAndHospitalDepartment',
        data: {},
        success:function (data) {
            //console.log(data);
            var hospitalDepartmentList = data.hospitalDepartmentList;
            var followUpList = data.followUpList;
            $("#followUp").empty();
            var a = '<option value="0">-请选择-</option>';
            for (var i = 0;i<followUpList.length;i++){
                a+='<option value="'+followUpList[i].followUpId+'">'+followUpList[i].followUpName+'</option>';
            }
            $("#followUp").append(a);

            $("#hospitalDepartment").empty();
            var b = '<option value="0">-请选择-</option>'
            for (var j = 0;j<hospitalDepartmentList.length;j++){
                b+='<option value="'+hospitalDepartmentList[j].hospitalDepartmentId+'">'+hospitalDepartmentList[j].hospitalDepartmentName+'</option>'
            }
            $("#hospitalDepartment").append(b);
        }
    })
}
function findCalendarData(v) {
    $.ajax({
        type:'post',
        url:'followUpManagementController/findCalendarData',
        data:{},
        success:function (data) {
            var day1 = new Date();
            var allDays = data[0];
            var intradayCheckedNumber = data[1];
            for (var key in allDays){
                var day2 = new Date(key);
                if (day2.getTime()-day1.getTime()<=0){
                    $("#"+key).html(intradayCheckedNumber[key]+'/'+allDays[key]);
                    if (intradayCheckedNumber[key]/allDays[key]<1){
                        $("#"+key).css("color","red");
                        $("#"+key).parent().append('<span style="position: absolute;right: 2px;bottom: 0px;width: 35px;height: 25px;color: red">'+(intradayCheckedNumber[key]/allDays[key])*100+'%</span>');
                    }else {
                        $("#"+key).css("color","green");
                        $("#"+key).parent().append('<span style="position: absolute;right: 2px;bottom: 0px;width: 35px;height: 25px;color: green">'+(intradayCheckedNumber[key]/allDays[key])*100+'%</span>');
                    }
                }else {
                    $("#"+key).html(allDays[key]);
                    $("#"+key).css("color","green");
                }
            }
            //console.log(data);
        }
    })
}
function findWeekData() {
    $.ajax({
        type:'post',
        url:'followUpManagementController/findCalendarData',
        data:{},
        success:function (data) {
            var day1 = new Date();
            var allDays = data[0];
            var intradayCheckedNumber = data[1];
            for (var key in allDays){
                var day2 = new Date(key);
                if (day2.getTime()-day1.getTime()<=0){
                    var a='<span style="width: 100%;height: 100%">'
                    a+='计划随访：'+allDays[key]+'</br>';
                    a+='实际随访：'+intradayCheckedNumber[key]+'</br>';
                    a+='随访进度：'+(intradayCheckedNumber[key]/allDays[key])*100+'%</br>';
                    a+='</span>'
                    $("#"+key).append(a);
                    for (var i=0;i<fp.list.length;i++){
                        console.log(fp.list[i].dateOfNextFollowUp)
                        if (fp.list[i].dateOfNextFollowUp==key){
                            var b=fp.list[i].patientName+'</br>';
                            $("#key"+key).append(b);
                        }
                    }
                }else {
                    var a='<span style="width: 100%;height: 100%">'
                    a+='计划随访：'+allDays[key]+'</br>';
                    a+='</span>'
                    $("#"+key).append(a);
                    for (var i=0;i<fp.list.length;i++){
                        console.log(fp.list[i].dateOfNextFollowUp)
                        if (fp.list[i].dateOfNextFollowUp==key){
                            var b=fp.list[i].patientName+'</br>';
                            $("#key"+key).append(b);
                        }
                    }
                }

            }
        }
    })
}
function tiaozhuan(id) {
    window.location.href = 'patientsWithDetails?id='+id;
}