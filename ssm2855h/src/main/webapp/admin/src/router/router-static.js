import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shouhou from '@/views/modules/shouhou/list'
    import discussxinwenxinxi from '@/views/modules/discussxinwenxinxi/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import xinwenleibie from '@/views/modules/xinwenleibie/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xinwenxinxi from '@/views/modules/xinwenxinxi/list'
    import chat from '@/views/modules/chat/list'
    import discussshangpinxinxi from '@/views/modules/discussshangpinxinxi/list'
    import jubaotousu from '@/views/modules/jubaotousu/list'
    import guanyuwomen from '@/views/modules/guanyuwomen/list'
    import messages from '@/views/modules/messages/list'
    import shangpinleixing from '@/views/modules/shangpinleixing/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shouhou',
        name: '售后',
        component: shouhou
      }
      ,{
	path: '/discussxinwenxinxi',
        name: '新闻信息评论',
        component: discussxinwenxinxi
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/xinwenleibie',
        name: '新闻类别',
        component: xinwenleibie
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xinwenxinxi',
        name: '新闻信息',
        component: xinwenxinxi
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/discussshangpinxinxi',
        name: '商品信息评论',
        component: discussshangpinxinxi
      }
      ,{
	path: '/jubaotousu',
        name: '举报投诉',
        component: jubaotousu
      }
      ,{
	path: '/guanyuwomen',
        name: '关于我们',
        component: guanyuwomen
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/shangpinleixing',
        name: '商品类型',
        component: shangpinleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
