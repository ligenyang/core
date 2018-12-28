window.onload = function (ev) {

};

function $(selector) {
    var identifier = selector.charAt(0);
    if('#' === identifier) { // id 选择器
        return document.getElementById(selector.replace(identifier, ''));
    }
    if('.' === identifier) { // class 选择器
        return document.getElementsByClassName(selector.replace(identifier, ''));
    }
    if('+' === identifier) { // 标签 选择器
        return document.getElementsByName(selector.replace(identifier, ''));
    }
}

function isEmpty(obj) {
    if(undefined === obj || null == obj || '' === obj.toString().replace(/(^\s*)|(\s*$)/g, "")) {
        return false;
    }
    return true;
}

var Ajax = function (url, method, async) {
    if('POST' === method.toUpperCase()) {
        method = 'POST';
    }

    var xhr = new XMLHttpRequest();
    xhr.open('GET', '/user/list', true);
};