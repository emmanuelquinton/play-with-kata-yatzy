package equinton.dev.kata.yatzy.util;

import java.util.stream.Stream;

import equinton.dev.kata.yatzy.domain.model.Roll;
import equinton.dev.kata.yatzy.domain.model.Score;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class FullHouseRollProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
            Arguments.of(new Game(Roll.of(new int[]{6,2,2,2,6}), Score.of(18))),
            Arguments.of(new Game(Roll.of(new int[]{2,3,4,5,6}), Score.zero())),
            Arguments.of(new Game(Roll.of(new int[]{1,1,2,2,2}), Score.of(8))),
            Arguments.of(new Game(Roll.of(new int[]{2,2,3,3,4}), Score.zero())),
            Arguments.of(new Game(Roll.of(new int[]{4,4,4,4,4 }), Score.zero()))
        );
    }
}
