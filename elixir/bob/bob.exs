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

  defp question?(input) do
    String.ends_with?(input, "?")
  end

  defp quiet?(input) do
    String.strip(input) == ""
  end

  defp shouting?(input) do
    String.match?(input, ~r/\pL/) && String.upcase(input) == input
  end
end
