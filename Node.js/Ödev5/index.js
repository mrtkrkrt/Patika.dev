const http = require("http");

const port = 5000;

const server = http.createServer((req, res) => {
    const url = req.url;

    if(url === "/"){
        res.writeHead(200, {"Content-type" : "text/html"});
        res.write("<h2>INDEX SAYFASINA HOSGELDINIZ</h2>");
    }else if(url === "/about"){
        res.writeHead(200, {"Content-type" : "text/html"});
        res.write("<h2>ABOUT SAYFASINA HOSGELDINIZ</h2>");
    }else if(url === "/contact"){
        res.writeHead(200, {"Content-type" : "text/html"});
        res.write("<h2>CONTACT SAYFASINA HOSGELDINIZ</h2>")
    }else{
        res.writeHead(404, {"Content-type" : "text/html"});
        res.write("<h2>404 PAGE NOT FOUND!!!</h2>")
    }
});

server.listen(port, () => {
    console.log(`Sunucu ${port}'unda başlatıldı.'`);
})