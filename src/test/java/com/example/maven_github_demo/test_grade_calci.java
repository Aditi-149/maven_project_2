package com.example.maven_github_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class test_grade_calci 
{
@Test
void testTotal()
{
	assertEquals(225,grade_calci.calculatetotal(75,68,82));
}
@Test
void testaverage()
{
	assertEquals(75,grade_calci.calculateaverage(75,68,82));
}
@Test
void testpass()
{
	assertTrue(grade_calci.ispass(75.0));
}
@Test
void testFail()
{
	assertFalse(grade_calci.ispass(35.0));
}
}