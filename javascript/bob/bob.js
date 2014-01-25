var Bob = function () {
    Bob.prototype.hey = function(message) {
        if (message.trim() === '')
            return 'Fine. Be that way!';
        if (message.toUpperCase() === message)
            return 'Woah, chill out!';
        if (message.slice(-1) === '?')
            return 'Sure.';
        return "Whatever.";
    };
};
module.exports = Bob;
