defmodule Teenager do
  def hey(input) do
    cond do
      question?(input) ->
        "Sure."
      quiet?(input) ->
        "Fine. Be that way!"
      shouting?(input)  ->
        "Whoa, chill out!"
      true ->
        "Whatever."
    end
  end

  def question?(input) do
    String.ends_with?(input, "?")
  end

  def quiet?(input) do
    String.strip(input) == ""
  end

  def shouting?(input) do
    String.match?(input, ~r/\pL/) && String.upcase(input) == input
  end
end
