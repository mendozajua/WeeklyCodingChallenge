var object1 = {
    o1: 1,
    o2: 2,
    o3: 3
};

var arr = [];
var arrKey = []

function objValueToArray(Object){
    for(const stuff in Object){
        arr.push(object1[stuff])
    }
    return arr;
}
function objKeyToArray(para1){
    arrKey = Object.keys(para1);
    return arrKey;
}
console.log("Object ", object1)
console.log("Now an Array of Key ",objKeyToArray(object1));
console.log("Now an Array of Value ",objValueToArray(object1));
