function circleAre(rad){
    return Math.PI * Math.pow(rad, 2);
}

function circleCircumference(rad){
    return Math.PI * 2 * rad;
}

module.exports = {
    circleAre,
    circleCircumference
}