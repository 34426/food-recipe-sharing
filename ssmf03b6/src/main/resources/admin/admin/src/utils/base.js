const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmf03b6/",
            name: "ssmf03b6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf03b6/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "美食食谱推荐分享系统"
        }
    }
}
export default base
