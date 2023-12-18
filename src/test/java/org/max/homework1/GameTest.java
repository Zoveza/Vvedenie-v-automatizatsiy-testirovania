package org.max.homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.max.home.Player;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Тест кейс для проверки инициализации игры
 */
public class GameTest extends AbstractTestHome {

    @Test
    void checkPlayerTest() {
        //given
        //when
        //then
        Assertions.assertNotNull(game.getPlayer());
    }

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Player player) {
        assertTrue(player == null);
    }
}