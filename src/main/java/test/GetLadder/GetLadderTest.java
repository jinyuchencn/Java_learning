package test.GetLadder; 

import GetLadder.GetLadder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** 
* GetLadder Tester. 
* 
* @author <Authors name> 
* @since <pre>ÈýÔÂ 10, 2019</pre> 
* @version 1.0 
*/ 
public class GetLadderTest { 

@Before
public void before() throws Exception {
//    GetLadder ttt = new GetLadder();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: GetLadderStr(String beginWord, String endWord, String filename) 
* 
*/ 
@Test
public void testGetLadderStr() throws Exception { 
//TODO: Test goes here...
    GetLadder ttt = new GetLadder();
    assertEquals("pig<--cig<--cag<--bag",ttt.GetLadderStr("bag","pig","D:\\github_code\\Java_learning\\src\\main\\java\\GetLadder\\dictionary.txt"));
} 

/** 
* 
* Method: GetSet(String filename) 
* 
*/ 
@Test
public void testGetSet() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
