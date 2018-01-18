<?php

namespace spec\LambdaRoma\LG2;

use LambdaRoma\LG2\TicTacToe;
use PhpSpec\ObjectBehavior;
use Prophecy\Argument;

class TicTacToeSpec extends ObjectBehavior
{
    private $game = [
        [" ", "O", "X"],
        [" ", "X", "O"],
        ["X", " ", " "]
    ];

    private $biggerGame = [
        ["X", " ", " ", " ", " ", " ", " ", " ", "O", " "],
        [" ", "X", " ", " ", " ", " ", " ", " ", "O", " "],
        [" ", " ", "X", " ", " ", " ", " ", " ", "O", " "],
        [" ", " ", " ", "X", " ", " ", " ", " ", "O", " "],
        [" ", " ", " ", " ", "X", " ", " ", " ", "O", " "],
        [" ", " ", " ", " ", " ", "X", " ", " ", "O", " "],
        [" ", " ", " ", " ", " ", " ", "X", " ", "O", " "],
        [" ", " ", " ", " ", " ", " ", " ", "X", "O", " "],
        [" ", " ", " ", " ", " ", " ", " ", " ", "X", "O"],
        [" ", " ", " ", " ", " ", " ", " ", " ", "O", "X"]
    ];

    function it_is_initializable()
    {
        $this->shouldHaveType(TicTacToe::class);
    }

    function it_should_not_be_null()
    {
        $this->winner($this->game)->shouldNotBe(null);
    }
}
