const Koa = require('koa');
const app = new Koa();

// response
app.use(ctx => {
    const url = ctx.url;
    const urls = ["/index", "/about", "/contact", "/"];

    if(url in urls){
        ctx.body  = `<h1>${url} Sayfasına Hoşgeldiniz</h1>`;
    }else{
        ctx.body = `<h1>404 Page Not Found</h1>`;
    }
});

app.listen(3000);