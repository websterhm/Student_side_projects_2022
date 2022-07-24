let fortunes = ["It is certain", 
"It is decidedly so", 
"Without a doubt", 
"Yes - definitely",
"You may rely on it", 
"As I see it, yes", 
"Most likely", 
"Outlook good", 
"Yes", "Signs point to yes",
"Don't count on it", 
"My reply is no",
"My sources say no", 
"Outlook not so good",
"Very doubtful", 
"Reply hazy, try again", 
"Ask again later", 
"Better not tell you now",
"Cannot predict now", 
"Concentrate and ask again"];

const request = 'Type your question and hit Enter';
const waiting= 'Focus on your question as I consult the beyond!'
const tellClick='When you are ready for the answer, click the Magic 8 Ball';

document.addEventListener('DOMContentLoaded',  ()=>{ 
const eight = document.getElementById('eight');
const answer = document.getElementById('answer');
const eightball = document.getElementById('eight-ball');
const question = document.getElementById('question');
const enter = document.getElementById('enter');

//eightball.addEventListener('click',

enter.addEventListener('click',  ()=>{
     
          let num = Math.floor(Math.random() * Math.floor(fortunes.length));
          answer.innerText= fortunes[num];
          
     });

});


