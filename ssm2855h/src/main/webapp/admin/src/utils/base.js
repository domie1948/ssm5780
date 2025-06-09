const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2855h/",
            name: "ssm2855h",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2855h/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上购物商城"
        } 
    }
}
export default base
