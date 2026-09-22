let searchEl=document.getElementById("search");
let convertEl=document.getElementById("convert-btn");
let lengthEl=document.getElementById("length");
let VolumeEl=document.getElementById("Volume");
let MassEl=document.getElementById("Mass");
convertEl.addEventListener("click",function(){
    let mtofeet=20*3.281;
    let ftom=20/3.281;
    let ltog=20*0.264;
    let gtol=20/0.264;
    let ktop=20*2.204;
    let ptok=20/2.204;
lengthEl.innerText+="20 meters = "+mtofeet.toFixed(3)+" "+"feet"+"|"+"20 feet="+" "+ftom.toFixed(3)+" "+"meters"
VolumeEl.innerText+="20 liters="+ltog.toFixed(3)+" "+"gallons"+"|"+"20 gallons="+" "+gtol.toFixed(3)+" "+"liters"
MassEl.innerText+="20 Kilos="+ktop.toFixed(3)+" "+"pounds"+"|"+"20 pounds="+" "+ptok.toFixed(3)+" "+"kilos"
})

