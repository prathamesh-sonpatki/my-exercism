class Bob
  hey: (message) ->
    if message.trim() == '' then return 'Fine. Be that way!'
    if message.toUpperCase() == message then return 'Woah, chill out!'
    if message.slice(-1) == '?' then return 'Sure.'
    "Whatever."

module.exports = Bob
