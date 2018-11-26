 function queryParams(params) {

            var temp = {  //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                //limit: params.limit,  //页面大小
                //page: params.offset, //页码  

                limit: params.pageSize,
                page: params.pageNumber,

                zhuti: zhutij,//实体订单
                leixing: leixingj,
                pingtai: mingchengj,
                qudao:qudaoj,
                disanfang:disanfangj
            };
            return temp;
        }

function searchAccount(){
	var zhutis = $("#jigou").bootstrapTable('getSelections');
	var zhutij = JSON.stringify(zhutis);
	
	var leixings = $("#leixing").bootstrapTable('getSelections');
	var leixingj = JSON.stringify(leixings);
	
	var mingchengs = $("#mingcheng").bootstrapTable('getSelections');
	var mingchengj = JSON.stringify(mingchengs);
	
	var qudaos = $("#qudao").bootstrapTable('getSelections');
	var qudaoj = JSON.stringify(qudaos);

	var disanfangs = $("#disanfang").bootstrapTable('getSelections');
	var disanfangj = JSON.stringify(disanfangs);

	//$.ajax({
			//url:"/account/example/",
	       // method: "POST",
	    	//dataType:"json",
	    	//data:{"zhuti":zhutij,"leixing":leixingj,"pingtai":mingchengj,"qudao":qudaoj,"disanfang":disanfangj},

	    	//success:function(res){
	    		
	    			$("#exampleTableEvents").bootstrapTable('destroy');
	    			$('#exampleTableEvents').bootstrapTable({
	    				url: "/account/example/",
	    				search: true,
	    		        showExport: true,  //是否显示导出按钮
	    				pagination: true,
	    				pageNumber: 1,                       //初始化加载第一页，默认第一页
	    				pageSize: 20,                       //每页的记录行数（*）
	    				pageList: [20, 50],        //可供选择的每页的行数（*）
	    				showRefresh: true,
	    				showToggle: true,
	    				showColumns: true,
	    				sidePagination: "server",
	    				iconSize: 'outline',
	    				toolbar: '#exampleTableEventsToolbar',
	    	            sortable: true,                     //是否启用排序
	                    detailView: true,//父子表

	    				contentType: "application/x-www-form-urlencoded",
	    				exportDataType: "all",              //basic', 'all', 'selected'.
	    				queryParams: function(params){
    	var temp = {  //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                //limit: params.limit,  //页面大小
                //page: params.offset, //页码  

                pageSize: params.limit,
                pageNum: params.offset/params.limit+1,
                zhuti: zhutij,//实体订单
                leixing: leixingj,
                pingtai: mingchengj,
                qudao:qudaoj,
                disanfang:disanfangj
            };
            return temp;
    },
   //请求服务器数据时的参数
    responseHandler:function(res){
        //在ajax获取到数据，渲染表格之前，修改数据源
        var nres = [];
        nres.push({total:res.total,rows:res.list});
        return nres[0];
    },
    icons: {
      refresh: 'glyphicon-repeat',
      toggle: 'glyphicon-list-alt',
      columns: 'glyphicon-list'

    },
    rowStyle: function (row, index) {
        //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
        var strclass = "";
        if (row.ext1 == "create") {
            strclass = 'success';//还有一个active
        }
        else if (row.ext1 == "已删除") {
            strclass = 'danger';
        }
        else {
            return {};
        }
        return { classes: strclass }
    		}

	              	})
	    	//}
		//});
}

(function(document, window, $) {
  'use strict';

  // Example Bootstrap Table From Data
  // ---------------------------------
  (function() {
    var bt_data = [{
      "Tid": "1",
      "First": "奔波儿灞",
      "sex": "男",
      "Score": "50"
    }, {
      "Tid": "2",
      "First": "灞波儿奔",
      "sex": "男",
      "Score": "94"
    }, {
      "Tid": "3",
      "First": "作家崔成浩",
      "sex": "男",
      "Score": "80"
    }, {
      "Tid": "4",
      "First": "韩寒",
      "sex": "男",
      "Score": "67"
    }, {
      "Tid": "5",
      "First": "郭敬明",
      "sex": "男",
      "Score": "100"
    }, {
      "Tid": "6",
      "First": "马云",
      "sex": "男",
      "Score": "77"
    }, {
      "Tid": "7",
      "First": "范爷",
      "sex": "女",
      "Score": "87"
    }];


    $('#exampleTableFromData').bootstrapTable({
      data: bt_data,
      // mobileResponsive: true,
      height: "250"
    });
  })();

  // Example Bootstrap Table Columns
  // -------------------------------
  (function() {
    $('#exampleTableColumns').bootstrapTable({
      url: "js/demo/bootstrap_table_test.json",
      height: "400",
      iconSize: 'outline',
      showColumns: true,
      icons: {
        refresh: 'glyphicon-repeat',
        toggle: 'glyphicon-list-alt',
        columns: 'glyphicon-list'
      }
    });
  })();


  // Example Bootstrap Table Large Columns
  // -------------------------------------


  // Example Bootstrap Table Toolbar
  // -------------------------------
  (function() {
    $('#exampleTableToolbar').bootstrapTable({
      url: "js/demo/bootstrap_table_test2.json",
      search: true,
      showRefresh: true,
      showToggle: true,
      showColumns: true,
      toolbar: '#exampleToolbar',
      iconSize: 'outline',
      icons: {
        refresh: 'glyphicon-repeat',
        toggle: 'glyphicon-list-alt',
        columns: 'glyphicon-list'
      }
    });
  })();


  // Example Bootstrap Table Events
  // ------------------------------
  (function() {
	    $('#exampleTableEvents').bootstrapTable({
    url: "/account/info/",
//    ajax:function(request){
//    	url:"/account/info/",
//    	type:"post",
//    	data:{"jigou":jigou,"leixing":leixing,"mingcheng":mingcheng,"qudao":qudao,"disanfang":disanfang},
//    	dataType:json
//    }
    search: true,
    pagination: true,
    pageNumber: 1,                       //初始化加载第一页，默认第一页
    pageSize: 20,                       //每页的记录行数（*）
    pageList: [20, 50],        //可供选择的每页的行数（*）
    showRefresh: true,
    showToggle: true,
    showColumns: true,
    showExport: true,  //是否显示导出按钮
    sortable: true,                     //是否启用排序
    sidePagination: "server",
    iconSize: 'outline',
    detailView: true,//父子表

    toolbar: '#exampleTableEventsToolbar',
    contentType: "application/x-www-form-urlencoded",
    exportDataType: "all",              //basic', 'all', 'selected'.
    queryParams: function (params) {
        return {
        pageNum: params.offset/params.limit+1,
        pageSize:params.limit
        }
    },//请求服务器数据时的参数
    responseHandler:function(res){
        //在ajax获取到数据，渲染表格之前，修改数据源
        var nres = [];
        nres.push({total:res.total,rows:res.list});
        return nres[0];
    },
    icons: {
      refresh: 'glyphicon-repeat',
      toggle: 'glyphicon-list-alt',
      columns: 'glyphicon-list'

    },
    rowStyle: function (row, index) {
        //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
        var strclass = "";
        if (row.ext1 == "create") {
            strclass = 'success';//还有一个active
        }
        else if (row.ext1 == "已删除") {
            strclass = 'danger';
        }
        else {
            return {};
        }
        return { classes: strclass }
    }

    });

    var $result = $('#examplebtTableEventsResult');

    $('#exampleTableEvents').on('all.bs.table', function(e, name, args) {
        console.log('Event:', name, ', data:', args);
      })
      .on('click-row.bs.table', function(e, row, $element) {
        $result.text('Event: click-row.bs.table');
      })
      .on('dbl-click-row.bs.table', function(e, row, $element) {
        $result.text('Event: dbl-click-row.bs.table');
      })
      .on('sort.bs.table', function(e, name, order) {
        $result.text('Event: sort.bs.table');
      })
      .on('check.bs.table', function(e, row) {
        $result.text('Event: check.bs.table');
      })
      .on('uncheck.bs.table', function(e, row) {
        $result.text('Event: uncheck.bs.table');
      })
      .on('check-all.bs.table', function(e) {
        $result.text('Event: check-all.bs.table');
      })
      .on('uncheck-all.bs.table', function(e) {
        $result.text('Event: uncheck-all.bs.table');
      })
      .on('load-success.bs.table', function(e, data) {
        $result.text('Event: load-success.bs.table');
      })
      .on('load-error.bs.table', function(e, status) {
        $result.text('Event: load-error.bs.table');
      })
      .on('column-switch.bs.table', function(e, field, checked) {
        $result.text('Event: column-switch.bs.table');
      })
      .on('page-change.bs.table', function(e, size, number) {
        $result.text('Event: page-change.bs.table');
      })
      .on('search.bs.table', function(e, text) {
        $result.text('Event: search.bs.table');
      });
  })();
})(document, window, jQuery);
