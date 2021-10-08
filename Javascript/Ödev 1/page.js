//console.log(hour + ":" + minutes + ":" + second);

var interval = setInterval(changeClock, 1000);

function changeClock(){
    var date = new Date();
    var hour = (date.getUTCHours() + 3) % 24;
    var minutes  = date.getUTCMinutes();
    var second = date.getUTCSeconds();
    var day = date.getDay()

    if (day == 1) {
        day = "Pazartesi";
      } else if (day == 2) {
        day = "Salı";
      } else if (day == 3) {
        day = "Çarşamba";
      } else if (day == 4) {
        day = "Perşembe";
      } else if (day == 5) {
        day = "Cuma";
      } else if (day == 6) {
        day = "Cumartesi";
      } else if (day == 7) {
        day = "Pazar";
      }
    
    var clockText = document.getElementsByTagName("p");
    clockText[1].innerText = hour + ":" + minutes + ":" + second + " " + day;
    clockText[2].innerText = "tarihinde Kodluyoruz Frontend Web Development Patikası'nın Javascript bölümü 1. Ödevindesiniz."
}

function input(){
    var giris = prompt("Lütfen İsminizi Giriniz.");
    var clockText = document.getElementsByTagName("p");
    clockText[0].innerText = "Merhaba " + giris + ", Hoş Geldin !"
}