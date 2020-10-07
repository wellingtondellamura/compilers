const vars = ['E', 'X','T','Y','F']
const ID = 'i';
const LP = '(';
const RP = ')'; 
const SUM = '+'; 
const MUL = '*'; 
const EOF = '$';
const predTable = (VR, tk) => {
    if (VR == 'E'){
        if (tk == ID || tk == LP) return "TX";
    }
    if (VR == 'X'){
        if (tk == SUM) return "+TX";
        if (tk == RP || tk == EOF) return "";
    }
    if (VR == 'T'){
        if (tk == ID || tk == LP) return "FY";
    }
    if (VR == 'Y'){
        if (tk == MUL) return "*FY";
        if (tk == RP || tk == SUM || tk == EOF) return "";
    }
    if (VR == 'F'){
        if (tk == ID) return "i";
        if (tk == LP) return "(E)";
    }
}

let input = "i+i*i";
let pos = 0;
const nextToken = () => {
    if (input.length>pos){
        return input[pos++]
    }else{
        return EOF;
    }
};

const parse = () => {
    let stack = ['$'];
    let a = nextToken();
    let X = 'E';
    while (X != EOF){
        console.log("X = "+X);
        console.log("A = "+a);
        if (X == a){
            console.log("match("+a+")");
            a = nextToken();
        } else if (vars.includes(X)){
            let m = predTable(X, a);
            console.log("M = "+m);
            if (m==undefined) return "error";
            m.split('').reverse().forEach(s => stack.push(s));
        }
        X = stack.pop();
    }
    return "success";
}

console.log(parse());