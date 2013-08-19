class Phrase
  def initialize(word)
    @word = word.downcase
  end

  def word_count_without_tap
    normalized_words.each.with_object(Hash.new(0)) do |word, counts|
      counts[word] += 1
    end
  end

  def word_count
    Hash.new(0).tap do |count|
      normalized_words.each { |w| count[w] += 1 }
    end
  end

  private

  def normalized_words
    @word.scan(/\w+/)
  end
end
