var v;
var checkedData;
layui.use(['tree', 'util'], function(){
    $.ajax({
        url:"selectDictionary",
        data:{},
        dataType:"json",
        type:"post",
        success:function (result) {
            console.log(result)
           for(var i=0;i<result.length;i++){
               var treeInformation1=result[0].treeInformation.id;
               var treeInformation2=result[21].treeInformation.id;
               var treeInformation3=result[37].treeInformation.id;
               if(treeInformation1==1){
                   treeInformation1="基本信息";
               }
               if(treeInformation2==2){
                   treeInformation2="首页信息";
               }
               if(treeInformation3==3){
                   treeInformation3="手术信息";
               }
            var tree = layui.tree
                ,layer = layui.layer
                ,util = layui.util
                ,data = [{
                        title: treeInformation1
                        ,id: 100
                        ,field: ''
                        ,children: [{
                            title: result[0].name
                            ,id: result[0].id
                            ,field: ''
                        },{
                            title: result[1].name
                            ,id:   result[1].id
                            ,field: ''
                        },{
                            title: result[2].name
                            ,id:   result[2].id
                            ,field: ''
                        },{
                            title: result[3].name
                            ,id:   result[3].id
                            ,field: ''
                        },{
                            title: result[4].name
                            ,id:     result[4].id
                            ,field: ''
                        },{
                            title: result[5].name
                            ,id:   result[5].id
                            ,field: ''
                        },{
                            title:  result[6].name
                            ,id:   result[6].id
                            ,field: ''
                        },{
                            title: result[7].name
                            ,id: result[7].id
                            ,field: ''
                        },{
                            title:result[8].name
                            ,id: result[8].id
                            ,field: ''
                        },{
                            title: result[9].name
                            ,id: result[9].id
                            ,field: ''
                            ,children: [{
                                title: result[9].children
                                ,id: result[9].childrenId
                                ,field: ''
                                // ,href: 'https://www.layui.com/doc/'
                            },{
                                title:result[10].children
                                ,id: result[10].childrenId
                                ,field: ''
                            },{
                                title: result[11].children
                                ,id: result[11].childrenId
                                ,field: ''
                            },{
                                title:  result[12].children
                                ,id: result[12].childrenId
                                ,field: ''
                            },{
                                title:  result[13].children
                                ,id: result[13].childrenId
                                ,field: ''
                            }]
                        },{
                            title: result[14].name
                            ,id: result[14].id
                            ,field: ''
                            ,children: [{
                                title: result[14].children
                                ,id: result[14].childrenId
                                ,field: ''
                            },{
                                title:result[15].children
                                ,id: result[15].childrenId
                                ,field: ''
                            },{
                                title:result[16].children
                                ,id:  result[16].childrenId
                                ,field: ''
                            },{
                                title: result[17].children
                                ,id: result[17].childrenId
                                ,field: ''
                            },{
                                title:  result[18].children
                                ,id: result[18].childrenId
                                ,field: ''
                            },{
                                title: result[19].children
                                ,id: result[19].childrenId
                                ,field: ''
                            },{
                                title: result[20].children
                                ,id: result[20].childrenId
                                ,field: ''
                            }]
                        }]
                    },{
                        title: treeInformation2
                        ,id: 200
                        ,field: ''
                        ,children: [{
                            title: result[21].name
                            ,id: result[21].id
                            ,field: ''
                        },{
                            title: result[22].name
                            ,id: result[22].id
                            ,field: ''
                        },{
                            title: result[23].name
                            ,id: result[22].id
                            ,field: ''
                        },{
                            title: result[24].name
                            ,id: result[24].id
                            ,field: ''
                        },{
                            title: result[25].name
                            ,id: result[25].id
                            ,field: ''
                        },{
                            title: result[26].name
                            ,id: result[26].id
                            ,field: ''
                        },{
                            title:result[27].name
                            ,id:  result[27].id
                            ,field: ''
                        },{
                            title:  result[28].name
                            ,id:  result[28].id
                            ,field: ''
                        },{
                            title: result[29].name
                            ,id:  result[29].id
                            ,field: ''
                        },{
                            title: result[30].name
                            ,id: result[30].id
                            ,field: ''
                        },{
                            title:  result[31].name
                            ,id:  result[31].id
                            ,field: ''
                        },{
                            title:  result[32].name
                            ,id: result[32].id
                            ,field: ''
                        },{
                            title:  result[33].name
                            ,id:  result[33].id
                            ,field: ''
                        },{
                            title:  result[34].name
                            ,id:  result[34].id
                            ,field: ''
                        },{
                            title:result[35].name
                            ,id: result[35].id
                            ,field: ''
                        },{
                            title: result[36].name
                            ,id: result[36].id
                            ,field: ''
                        }]
                    },{
                        title: treeInformation3
                        ,id: 300
                        ,field: ''
                        ,children: [{
                            title:result[37].name
                            ,id: result[37].id
                            ,field: ''
                        },{
                            title: result[38].name
                            ,id: result[38].id
                            ,field: ''
                        },{
                            title: result[39].name
                            ,id: result[39].id
                            ,field: ''
                        },{
                            title:result[40].name
                            ,id: result[40].id
                            ,field: ''
                        },{
                            title: result[41].name
                            ,id: result[41].id
                            ,field: ''
                        },{
                            title: result[42].name
                            ,id: result[42].id
                            ,field: ''
                        },{
                            title: result[43].name
                            ,id: result[43].id
                            ,field: ''
                        },{
                            title: result[44].name
                            ,id: result[44].id
                            ,field: ''
                            ,children: [{
                                title: result[44].children
                                ,id: result[44].childrenId
                                ,field: ''
                            },{
                                title:result[45].children
                                ,id: result[45].childrenId
                                ,field: ''
                            },{
                                title: result[46].children
                                ,id: result[46].childrenId
                                ,field: ''
                            },{
                                title:result[47].children
                                ,id: result[47].childrenId
                                ,field: ''
                            },{
                                title: result[48].children
                                ,id: result[48].childrenId
                                ,field: ''
                            },{
                                title:result[49].children
                                ,id: result[49].childrenId
                                ,field: ''
                            }]
                        }]
                    }]
           }
            tree.render({
                elem: '#test12'
                ,data: data
                ,showCheckbox: true  //是否显示复选框
                ,id: 'demoId1'
                ,isJump: true //是否允许点击节点时弹出新窗口跳转
                ,click: function(obj){
                    var data = obj.data;  //获取当前点击的节点数据
                    layer.msg('状态：'+ obj.state + '<br>节点数据：' + JSON.stringify(data));
                }
            });

            function rand(min,max) {
                return Math.floor(Math.random()*(max-min))+min;
            }
            //按钮事件

            util.event('lay-demo', {
                getChecked: function(othis){
                    checkedData = tree.getChecked('demoId1'); //获取选中节点的数据
                    aa=checkedData;
                    var a=new Array();
                    for (var j = 0; j <checkedData.length; j++) {
                        var title2 = checkedData[j].children.length;
                        //树节点data
                        for(var jj = 0; jj <title2; jj++){
                            var title = checkedData[j].children[jj].title;
                            //树节点id
                            var id = checkedData[j].children[jj].id;
                            var ss="对应id";
                            var randnum=rand(1000,9999);
                            var title3 = checkedData[j];
                            // var s=;
                            if(id==10||id==15 ||id==67){
                                for (var ils=0;ils<checkedData[j].children[jj].children.length;ils++){
                                    title = checkedData[j].children[jj].children[ils].title;
                                    //树节点id
                                    id = checkedData[j].children[jj].children[ils].id;
                                    ss="对应id";
                                    title3 = checkedData[j].children[jj];
                                    randnum=rand(1000,9999);
                                    console.log(window.parent.cha123(id));//是否能往里面添加
                                    if(window.parent.cha123(id)){
                                        v+="<tr>";
                                        v+='<td style="color: #0E74B4"">'+title +'</td>'
                                        v+='<td>'+"<input type='text' id='"+id+"' onfocus='cha(this.id)' onclick='cha2("+JSON.stringify(title3)+")'>"+'</td>';
                                        v+='<td style="color: #0E74B4"">'+ss +'</td>'
                                        v+='<td>'+"<input  type='text' value='"+id+"' />"+'</td>';
                                        v+="</tr>";
                                    }else{
                                        continue;
                                    }
                                }
                            }else {
                                console.log(window.parent.cha123(id));//是否能往里面添加
                                if(window.parent.cha123(id)){

                                    v+="<tr>";
                                    v+='<td style="color: #0E74B4"">'+title +'</td>'
                                    v+='<td>'+"<input type='text' id='"+id+"' onfocus='cha(this.id)' onclick='cha2("+JSON.stringify(title3)+")'>"+'</td>';
                                    v+='<td style="color: #0E74B4"">'+ss +'</td>'
                                    v+='<td>'+"<input  type='text' value='"+id+"' />"+'</td>';
                                    v+="</tr>";

                                }else{
                                    continue;
                                }

                            }
                        }
                    }

                    var a = $('#content1', parent.document).append(v);
                }
                ,setChecked: function(){
                    tree.setChecked('demoId1', [100,200,300]); //勾选指定节点
                }
                ,reload: function(){
                    //重载实例
                    tree.reload('demoId1', {

                    });

                }
            });
        }
    })
});