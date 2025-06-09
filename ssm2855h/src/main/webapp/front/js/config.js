
var projectName = '网上购物商城';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '关于我们',
	url: './pages/guanyuwomen/list.html'
}, 
{
	name: '商品信息',
	url: './pages/shangpinxinxi/list.html'
}, 
{
	name: '新闻信息',
	url: './pages/xinwenxinxi/list.html'
}, 

{
	name: '交流论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm2855h/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"关于我们","menuJump":"列表","tableName":"guanyuwomen"}],"menu":"关于我们管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品类型","menuJump":"列表","tableName":"shangpinleixing"}],"menu":"商品类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"新闻类别","menuJump":"列表","tableName":"xinwenleibie"}],"menu":"新闻类别管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"举报投诉","menuJump":"列表","tableName":"jubaotousu"}],"menu":"举报投诉管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"售后","menuJump":"列表","tableName":"shouhou"}],"menu":"售后管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"新闻信息","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"buttons":["查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"关于我们列表","menuJump":"列表","tableName":"guanyuwomen"}],"menu":"关于我们模块"},{"child":[{"buttons":["查看","查看评论","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"新闻信息列表","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"举报投诉","menuJump":"列表","tableName":"jubaotousu"}],"menu":"举报投诉管理"},{"child":[{"buttons":["查看","修改","删除","申请售后","支付"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"售后","menuJump":"列表","tableName":"shouhou"}],"menu":"售后管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"关于我们列表","menuJump":"列表","tableName":"guanyuwomen"}],"menu":"关于我们模块"},{"child":[{"buttons":["查看","查看评论","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"新闻信息列表","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
