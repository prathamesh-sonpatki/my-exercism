var Bob = function () {
  var isQuite = function(message) {
    return (message.trim() === '');
  };

  var isShouting = function(message) {
    return (message.toUpperCase() === message);
  };

  var isAsking = function(message) {
    return (message.slice(-1) === '?');
  };

  var responses = { quite: 'Fine. Be that way!',
                    shouting: 'Woah, chill out!',
                    asking: 'Sure.',
                    default: 'Whatever.' };

  Bob.prototype.hey = function(message) {
    if (isQuite(message))
      return responses.quite;
    if (isShouting(message))
      return responses.shouting;
    if (isAsking(message))
      return responses.asking;

    return responses.default;
    };
};
module.exports = Bob;
