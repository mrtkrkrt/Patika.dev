const fs = require("fs");

// Create eemployee.json
/* fs.writeFile("Ödev4/employee.json", "{'name' : 'Murat', 'salary' : 2000}", (err) => {
    if(err) console.log(err);
    console.log("DOSYA BAŞARILI BİR ŞEKİLDE OLUŞTURULDU");
}) */

// Read employee.json
/* fs.readFile("./Ödev4/employee.json", "utf8", (err, data) => {
    if(err) console.log(err);
    console.log(data);
}); */

// Update Employee.json
/* fs.appendFile("./Ödev4/employee.json", '{"name" : "Ahmet", "salary" : 10000}', "utf8", (err) => {
    if(err) console.log(err);
    console.log("Başarılı bir şekilde güncellendi.");
}) */

fs.unlink("./Ödev4/employee.json", (err) => {
    if(err) console.log(err);
    console.log("Başarılı bir şekilde silindi.")
})