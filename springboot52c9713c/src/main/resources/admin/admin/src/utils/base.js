const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot52c9713c/",
            name: "springboot52c9713c",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot52c9713c/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身俱乐部网站的设计与实现"
        } 
    }
}
export default base
