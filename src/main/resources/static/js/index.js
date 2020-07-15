var nextMonth = 0;
function mm(nextMonth){
	findCalendarData();

	var time = new Date();
	var testYear = time.getFullYear(), testMonth = time.getMonth(),testDay = time.getDate();
	var currentYear = time.getFullYear(), currentMonth = time.getMonth();//获取当前年、月
	var year = currentYear % 100 == 0 ? res = (currentYear % 400 == 0 ? 1:0) : res = (currentYear % 4 == 0 ? 1:0);//判断闰年平年
	var month_days = new Array(31,28+year,31,30,31,30,31,31,30,31,30,31);
	var week = time.getDay();//获取当前周几
	var day = time.getDate();//今天几号
	var w = week;
	if(week==0){
		w = 7;
	}
	var dd = Math.ceil((day + 6 - w) / 7);//当前第几周
	var a = '<tr>';
	/*
        上个月下个月的方法
    */
	if(nextMonth!=0&&nextMonth!=null){
		currentMonth+=nextMonth;//下个月当前月份加一
		currentYear+=Math.floor(currentMonth/12);
		currentMonth-=Math.floor(currentMonth/12)*12;
		var res = new Date(currentYear,currentMonth,1);
		day = res.getDate();
		week = res.getDay();
		w = week;
		if(week==0){
			w = 7;
		}
		dd = Math.ceil((day + 6 - w) / 7);//当前第几周
		if(dd==0){
			dd+=1;
		}
	}
	//alert(dd)
	var yyyy=currentYear;
	var MM=currentMonth;
	if(currentMonth>=12){
		yyyy+=Math.floor(currentMonth/12);
		MM=MM-Math.floor(currentMonth/12)*12;
	}
	var b = yyyy+'-'+(MM+1);
	$("#yearAndMonth").html(b);
	if(currentMonth>12){
		var cha = yyyy-currentYear;
		currentMonth = currentMonth-Math.floor(currentMonth/12)*12;
	}else if(currentMonth==0){
		currentMonth=12;
	}
	/* for(var i=0;i<42;i++){
        var date_str = i - week +1;
        if(date_str <= 0 && currentMonth != 0){
            date_str = month_days[currentMonth - 1] + date_str;
        }else if(date_str <= 0 && currentMonth == 0){
            date_str = month_days[month_days.length - 1] + date_str;
        }else if(date_str > month_days[currentMonth]){
            date_str = date_str - month_days[currentMonth];
        }
    } */
	var nextMonthDay = 1;
	var idMonth = currentMonth+1;
	if (idMonth/10<1){
		idMonth = '0'+idMonth;
	}


	for(var jj = 1;jj<=6;jj++){

		switch(week){
			case 0:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 1:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 2:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 3:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 4:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 5:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
			case 6:
				for(var j=0;j<7;j++){
					var idDay = ((day-7*(dd-jj)) - (week-j));
					if (idDay/10<1){
						idDay = '0'+idDay;
					}
					if(((day-7*(dd-jj)) - (week-j))<1){
						a+='<td>'+(month_days[currentMonth-1]+((day-7*(dd-jj)) - (week-j)))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
					}else if(((day-7*(dd-jj)) - (week-j))>(month_days[currentMonth])){
						a+='<td>'+nextMonthDay+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						nextMonthDay++;
					}else{
						if(testYear==currentYear&&testMonth==currentMonth&&testDay==((day-7*(dd-jj)) - (week-j))){
							a+='<td style="color:green">'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}else{
							a+='<td>'+((day-7*(dd-jj)) - (week-j))+'<span style="left: 8px;" id="'+currentYear+'-'+idMonth+'-'+idDay+'"></span></td>';
						}
					}
				}
				a+='</tr>';
				break;
		}

		/* for(var j=0;j<7;j++){
            a+='<td>'+((day-7*(dd-jj)) - (week-j))+'</td>';
        }
        a+='</tr>'; */
	}
	$("#table").empty();
	$("#table").append('<thead><tr><td>周日</td><td>周一</td><td>周二</td><td>周三</td><td>周四</td><td>周五</td><td>周六</td></tr></thead>');
	$("#table").append('<tbody id="tbody2"></tbody>')
	$("#tbody2").empty();
	$("#tbody2").append(a);

}
$(function(){
	mm();
})
function xiayiyuefen(){
	nextMonth++;
	mm(nextMonth);
}
function shanggeyue(){
	nextMonth--;
	mm(nextMonth);
}
function weekend(){
	var time = new Date();
	var currentYear = time.getFullYear(), currentMonth = time.getMonth();//获取当前年、月
	var week = time.getDay();//获取当前周几
	var day = time.getDate();//今天几号
	var weeks = new Array("周日","周一","周二","周三","周四","周五","周六")
	$("#table").empty();
	var th = '<thead><tr>';
	var a ='<tr style="height:30%">';
	var b ='<tr style="height:70%">';
	var idMonth = (currentMonth+1);
	if (idMonth/10<1){
		idMonth = '0'+idMonth;
	}

			for(var j=0;j<7;j++){
				var idDay = (day - (week-j));
				if (idDay/10<1){
					idDay = '0'+idDay;
				}
				th+='<td>'+weeks[j]+(day- (week-j))+'</td>';
				a+='<td id="'+currentYear+'-'+idMonth+'-'+idDay+'"></td>';
				b+='<td id="key'+currentYear+'-'+idMonth+'-'+idDay+'">患者列表：</br></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
		//	break;
		/*case 1:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day - (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
		case 2:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day- (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
		case 3:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day- (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
		case 4:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day- (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
		case 5:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day- (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
		case 6:
			for(var j=0;j<7;j++){
				th+='<td>'+weeks[j]+(day- (week-j))+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
				a+='<td id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></td>';
				b+='<td>患者列表：'+'<span id="'+currentYear+'-'+(currentMonth+1)+'-'+(day - (week-j))+'"></span></td>';
			}
			a+='</tr>';
			b+='</tr>';
			th+='</tr></thead>';
			break;
	*/
	$("#table").append(th);
	$("#table").append("<tbody id='tbody2'></tbody>");
	$("#tbody2").append(a);
	$("#tbody2").append(b);

	findWeekData();
}
function refresh(){
	mm();
}