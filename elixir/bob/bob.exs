defmodule Teenager do
  def hey(input) do
    cond do
      question?(input) ->
        "Sure."
      quite?(input) ->
        "Fine. Be that way!"
      shouting?(input)  ->
        "Whoa, chill out!"
      true ->
        "Whatever."
    end
  end

  def question?(input) do
    String.at(input, -1) == "?"
  end

  def quite?(input) do
    String.strip(input) == ""
  end

  def shouting?(input) do
    String.match?(input, ~r/\pL/) && String.upcase(input) == input
  end
end
