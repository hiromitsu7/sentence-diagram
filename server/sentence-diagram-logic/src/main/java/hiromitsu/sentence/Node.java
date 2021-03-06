package hiromitsu.sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * 文中の句または節.グラフにおける頂点.
 */
@Data
public class Node {
  private List<Word> wordList = new ArrayList<>();

  public String toPrettyString() {
    List<String> tokens = wordList.stream().map(Word::getToken).collect(Collectors.toList());
    return tokens.stream().collect(Collectors.joining(" "));
  }

  public String getWordIds() {
    return this.getWordList().stream().map(w -> Integer.toString(w.getIndex())).collect(Collectors.joining("_"));
  }
}
