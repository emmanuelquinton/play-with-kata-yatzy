package equinton.dev.kata.yatzy.util;

import java.util.stream.Stream;

import equinton.dev.kata.yatzy.domain.model.Roll;
import equinton.dev.kata.yatzy.domain.model.Score;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class PairRollProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
            Arguments.of(new Game(Roll.of(new int[]{1,2,3,4,5}), Score.zero())),
            Arguments.of(new Game(Roll.of(new int[]{3,3,3,4,4}), Score.of(8))),
            Arguments.of(new Game(Roll.of(new int[]{1,1,6,2,6}), Score.of(12))),
            Arguments.of(new Game(Roll.of(new int[]{3,3,3,4,1}), Score.of(6))),
            Arguments.of(new Game(Roll.of(new int[]{3,3,3,3,1}), Score.of(6))),
            Arguments.of(new Game(Roll.of(new int[]{3,4,3,5,6}), Score.of(6))),
            Arguments.of(new Game(Roll.of(new int[]{5,3,3,3,5}), Score.of(10))),
            Arguments.of(new Game(Roll.of(new int[]{5,3,6,6,5}), Score.of(12)))
        );
    }
}
