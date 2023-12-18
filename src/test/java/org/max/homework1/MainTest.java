package org.max.homework1;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
        import org.max.home.Door;

/**
 * Тест-кейс для тестирования методов
 */

public class MainTest extends AbstractTestHome{

    @Test
    void LoseWithRisk() {
        //given
        game.initDoors();
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    void WinWithRisk () {
        //given
        game.initDoors();
        //when
        Door door = game.round(1);
        //then
        Assertions.assertTrue(door.isPrize());
    }

}