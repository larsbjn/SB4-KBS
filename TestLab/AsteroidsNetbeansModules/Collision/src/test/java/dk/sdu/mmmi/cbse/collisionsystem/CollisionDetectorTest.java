/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author larsjorgensen
 */
public class CollisionDetectorTest {
    
    public CollisionDetectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of process method, of class CollisionDetector.
     */
    @Test
    public void testCollision() {
        System.out.println("Testing Collision between two entities");
        
        Entity e1 = new Entity();
        e1.setRadius(10);
        PositionPart pos1 = new PositionPart(100, 100, 10);
        e1.add(pos1);
        
        Entity e2 = new Entity();
        e2.setRadius(10);
        PositionPart pos2 = new PositionPart(100, 110, 10);
        e2.add(pos2);
        
        CollisionDetector instance = new CollisionDetector();
        
        // Testing if the two entities hit eachother
        assertTrue(instance.Collides(e1, e2));
        
        // Changes the second entity position and checks again
        pos2.setX(200);
        assertFalse(instance.Collides(e1, e2));
        
    }
    
}
