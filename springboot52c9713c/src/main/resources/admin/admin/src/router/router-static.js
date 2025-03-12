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
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import yuyuejiaolian from '@/views/modules/yuyuejiaolian/list'
    import huiyuanka from '@/views/modules/huiyuanka/list'
    import discusskechengxinxi from '@/views/modules/discusskechengxinxi/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import kechengleixing from '@/views/modules/kechengleixing/list'
    import forum from '@/views/modules/forum/list'
    import jianshenbaike from '@/views/modules/jianshenbaike/list'
    import kechengbaoming from '@/views/modules/kechengbaoming/list'
    import shangpindingdan from '@/views/modules/shangpindingdan/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import discussjianshenshangpin from '@/views/modules/discussjianshenshangpin/list'
    import zhijiaojiaolian from '@/views/modules/zhijiaojiaolian/list'
    import config from '@/views/modules/config/list'
    import chongzhixinxi from '@/views/modules/chongzhixinxi/list'
    import jianshenshangpin from '@/views/modules/jianshenshangpin/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/news',
        name: '健身资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/yuyuejiaolian',
        name: '预约教练',
        component: yuyuejiaolian
      }
      ,{
	path: '/huiyuanka',
        name: '会员卡',
        component: huiyuanka
      }
      ,{
	path: '/discusskechengxinxi',
        name: '课程信息评论',
        component: discusskechengxinxi
      }
      ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/kechengleixing',
        name: '课程类型',
        component: kechengleixing
      }
      ,{
	path: '/forum',
        name: '健身论坛',
        component: forum
      }
      ,{
	path: '/jianshenbaike',
        name: '健身百科',
        component: jianshenbaike
      }
      ,{
	path: '/kechengbaoming',
        name: '课程报名',
        component: kechengbaoming
      }
      ,{
	path: '/shangpindingdan',
        name: '商品订单',
        component: shangpindingdan
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
	path: '/discussjianshenshangpin',
        name: '健身商品评论',
        component: discussjianshenshangpin
      }
      ,{
	path: '/zhijiaojiaolian',
        name: '执教教练',
        component: zhijiaojiaolian
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/chongzhixinxi',
        name: '充值信息',
        component: chongzhixinxi
      }
      ,{
	path: '/jianshenshangpin',
        name: '健身商品',
        component: jianshenshangpin
      }
      ,{
	path: '/newstype',
        name: '健身资讯分类',
        component: newstype
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
