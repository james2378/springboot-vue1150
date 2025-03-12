import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import zhijiaojiaolianList from '../pages/zhijiaojiaolian/list'
import zhijiaojiaolianDetail from '../pages/zhijiaojiaolian/detail'
import zhijiaojiaolianAdd from '../pages/zhijiaojiaolian/add'
import jianshenbaikeList from '../pages/jianshenbaike/list'
import jianshenbaikeDetail from '../pages/jianshenbaike/detail'
import jianshenbaikeAdd from '../pages/jianshenbaike/add'
import kechengleixingList from '../pages/kechengleixing/list'
import kechengleixingDetail from '../pages/kechengleixing/detail'
import kechengleixingAdd from '../pages/kechengleixing/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import kechengbaomingList from '../pages/kechengbaoming/list'
import kechengbaomingDetail from '../pages/kechengbaoming/detail'
import kechengbaomingAdd from '../pages/kechengbaoming/add'
import jianshenshangpinList from '../pages/jianshenshangpin/list'
import jianshenshangpinDetail from '../pages/jianshenshangpin/detail'
import jianshenshangpinAdd from '../pages/jianshenshangpin/add'
import shangpinfenleiList from '../pages/shangpinfenlei/list'
import shangpinfenleiDetail from '../pages/shangpinfenlei/detail'
import shangpinfenleiAdd from '../pages/shangpinfenlei/add'
import yuyuejiaolianList from '../pages/yuyuejiaolian/list'
import yuyuejiaolianDetail from '../pages/yuyuejiaolian/detail'
import yuyuejiaolianAdd from '../pages/yuyuejiaolian/add'
import huiyuankaList from '../pages/huiyuanka/list'
import huiyuankaDetail from '../pages/huiyuanka/detail'
import huiyuankaAdd from '../pages/huiyuanka/add'
import shangpindingdanList from '../pages/shangpindingdan/list'
import shangpindingdanDetail from '../pages/shangpindingdan/detail'
import shangpindingdanAdd from '../pages/shangpindingdan/add'
import chongzhixinxiList from '../pages/chongzhixinxi/list'
import chongzhixinxiDetail from '../pages/chongzhixinxi/detail'
import chongzhixinxiAdd from '../pages/chongzhixinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discusskechengxinxiList from '../pages/discusskechengxinxi/list'
import discusskechengxinxiDetail from '../pages/discusskechengxinxi/detail'
import discusskechengxinxiAdd from '../pages/discusskechengxinxi/add'
import discussjianshenshangpinList from '../pages/discussjianshenshangpin/list'
import discussjianshenshangpinDetail from '../pages/discussjianshenshangpin/detail'
import discussjianshenshangpinAdd from '../pages/discussjianshenshangpin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'zhijiaojiaolian',
					component: zhijiaojiaolianList
				},
				{
					path: 'zhijiaojiaolianDetail',
					component: zhijiaojiaolianDetail
				},
				{
					path: 'zhijiaojiaolianAdd',
					component: zhijiaojiaolianAdd
				},
				{
					path: 'jianshenbaike',
					component: jianshenbaikeList
				},
				{
					path: 'jianshenbaikeDetail',
					component: jianshenbaikeDetail
				},
				{
					path: 'jianshenbaikeAdd',
					component: jianshenbaikeAdd
				},
				{
					path: 'kechengleixing',
					component: kechengleixingList
				},
				{
					path: 'kechengleixingDetail',
					component: kechengleixingDetail
				},
				{
					path: 'kechengleixingAdd',
					component: kechengleixingAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'kechengbaoming',
					component: kechengbaomingList
				},
				{
					path: 'kechengbaomingDetail',
					component: kechengbaomingDetail
				},
				{
					path: 'kechengbaomingAdd',
					component: kechengbaomingAdd
				},
				{
					path: 'jianshenshangpin',
					component: jianshenshangpinList
				},
				{
					path: 'jianshenshangpinDetail',
					component: jianshenshangpinDetail
				},
				{
					path: 'jianshenshangpinAdd',
					component: jianshenshangpinAdd
				},
				{
					path: 'shangpinfenlei',
					component: shangpinfenleiList
				},
				{
					path: 'shangpinfenleiDetail',
					component: shangpinfenleiDetail
				},
				{
					path: 'shangpinfenleiAdd',
					component: shangpinfenleiAdd
				},
				{
					path: 'yuyuejiaolian',
					component: yuyuejiaolianList
				},
				{
					path: 'yuyuejiaolianDetail',
					component: yuyuejiaolianDetail
				},
				{
					path: 'yuyuejiaolianAdd',
					component: yuyuejiaolianAdd
				},
				{
					path: 'huiyuanka',
					component: huiyuankaList
				},
				{
					path: 'huiyuankaDetail',
					component: huiyuankaDetail
				},
				{
					path: 'huiyuankaAdd',
					component: huiyuankaAdd
				},
				{
					path: 'shangpindingdan',
					component: shangpindingdanList
				},
				{
					path: 'shangpindingdanDetail',
					component: shangpindingdanDetail
				},
				{
					path: 'shangpindingdanAdd',
					component: shangpindingdanAdd
				},
				{
					path: 'chongzhixinxi',
					component: chongzhixinxiList
				},
				{
					path: 'chongzhixinxiDetail',
					component: chongzhixinxiDetail
				},
				{
					path: 'chongzhixinxiAdd',
					component: chongzhixinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discusskechengxinxi',
					component: discusskechengxinxiList
				},
				{
					path: 'discusskechengxinxiDetail',
					component: discusskechengxinxiDetail
				},
				{
					path: 'discusskechengxinxiAdd',
					component: discusskechengxinxiAdd
				},
				{
					path: 'discussjianshenshangpin',
					component: discussjianshenshangpinList
				},
				{
					path: 'discussjianshenshangpinDetail',
					component: discussjianshenshangpinDetail
				},
				{
					path: 'discussjianshenshangpinAdd',
					component: discussjianshenshangpinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
