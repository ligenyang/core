/*
    Regular Expression 正则表达式
*/

function re(selector) {
    var identifier = selector.charAt(0);
    if('#' === identifier) {
        return document.getElementById(selector);
    }
    if('.' === identifier) {
        return document.getElementsByClassName(selector);
    }
    if('+' === identifier) {
        return document.getElementsByName(selector);
    }
}

var regex = {
    number: /[0-9]/, // 数字
    letter: /[A-z]/, // 大小写字母
    lowercaseLetter: /[a-z]/, // 小写字母
    uppercaseLetter: /[A-Z]/, // 大写字母
    whitespace: /\s+/g, // 空格
    asterisk: /\d*/g, // 匹配数字0个或n个
};