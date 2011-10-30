package psu.se.wordslam.model;

import java.util.ArrayList;

/**
 * Represents a game in the system
 */
public class Game 
{
	private LetterGrid 			m_Grid;
	private ArrayList<String> 	wordsFound;
	private ArrayList<String> 	allWords;
	
	private GameType m_GameType;
	
	private int m_TotalGameTimeInMS;

	private int m_GameTimeRemaininginMS;

	/**
	 * Basic constructor - sets defaults for everything
	 */
	public Game(GameType gameType)
	{
		this.m_GameType = gameType;
		this.m_Grid = new LetterGrid();
		this.m_Grid.GenerateRandomBoard();
		this.wordsFound = new ArrayList<String>();
		this.allWords = new ArrayList<String>();
		// get all words from dictionary and add to allWords list
		
		char[][] test =  
		{
			{'P','Q','E','T','T'},
			{'K','Z','I','Z','O'},
			{'K','M','I','M','P'},
			{'H','N','O','T','E'},
			{'R','O','I','B','X'}
		};
		//this.m_Grid.Fill(test);
		this.m_TotalGameTimeInMS = 5000;
		this.m_TotalGameTimeInMS = 5000;
	}
	
	/**
	 * Retrieval method for the GameType property
	 * @return GameType internal value
	 */
	public GameType GetGameType()
	{
		return this.m_GameType;
	}
	
	/**
	 * Setter method for the GameType property
	 * @param gameType Incoming GameType enumeration value
	 */
	public void SetGameType(GameType gameType)
	{
		this.m_GameType = gameType;
	}
	
	/**
	 * Retrieval method for the Total Game Time property
	 * @return Total game time value
	 */
	public int GetTotalGameTime()
	{
		return this.m_TotalGameTimeInMS;
	}
	
	/**
	 * Setter method for the Total Game Time property
	 * @param gameTime Incoming Game Time value
	 */
	public void SetTotalGameTime(int gameTime)
	{
		this.m_TotalGameTimeInMS = gameTime;
	}
	
	/**
	 * Retrieval method for the remaining Game Time property
	 * @return Remaining game time value
	 */
	public int GetRemainingGameTime()
	{
		return this.m_GameTimeRemaininginMS;
	}

	/**
	 * Setter method for the Remaining Game Time property
	 * @param gameTime Incoming Game Time value
	 */
	public void SetRemainingGameTime(int gameTime)
	{
		this.m_GameTimeRemaininginMS = gameTime;
	}
	
	/**
	 * Retrieval method for the remaining Grid property
	 * @return LetterGrid object
	 */
	public LetterGrid GetGrid()
	{
		return this.m_Grid;
	}
	
	/**
	 * GameType enumeration
	 */
	public enum GameType
	{
		SinglePlayer,
		MultiPlayer
	}

	public void StartTimer() 
	{
		//TODO
	}
	
	public void PauseTimer()
	{
		//TODO
	}
	
	
	/**
	 * Retrieval method for all words found by player
	 * @return wordsFound list
	 */
	public ArrayList<String> getFoundWords() 
	{
		return wordsFound;
	}
	
	
	/**
	 * Retrieval method for all words on board
	 * @return allWords list
	 */
	public ArrayList<String> getAllWords()
	{
		return allWords;
	}
	
	
	/**
	 * Adds a word to the list of all words found by player
	 * @param word Word found by player
	 */
	public void addFoundWord(String word)
	{
		wordsFound.add(word);	
	}
	
}
