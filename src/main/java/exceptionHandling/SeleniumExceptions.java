package exceptionHandling;
/***
 * 
 * 1. No suchElement Exception - try and catch or using explicit webdriverwait until element present condition
 * 2. ELement not visible exception - available in dom and not visible - hidden - > use if displayed with try and catch or forcefully make it visible using java script executor and then click
 * 3. Staleelment Reference exception - when element is not attached to dom - usually after page update or refresh
 * 		Relocate the element using try and catch i.e add same element location and operation code in catch block as well
 * 
 * 4.Invalidelementstateexception - element is in disabled state when entering text or clicking 
 * 5. Elementclickintercepted exception - when other elements objects on click action
 * 6. 	- Using try and catch block
 * 		- Using explicit wait, wait until element is clickable
 * 		- Using java script executor
 * 
 * 7. Element not interactable exception - Element is present in dom but hidden or disabled
 * 		- try , catch and explicit wait until element clickable, java script executor
 * 
 * 8.No such attribute exception - when field dont have attribute written in code - handle using try and catch
 * 
 * 9. Nosuchwindow exception - while working with multiple windows - try and catch
 * 
 * 10.No suchframe exception - try and catch
 * 
 * 11. No alert present exception 
 * 
 * 12. Unhandledalertexception - when alert prevents driver to interact with page until alert is closed, handle alert with try and catch
 * 
 * 13. Move target out of bound exception - Related to mouse action, when mouse moves out of actionable area, try and catch
 * 
 * 14. Screenshot exception - while capturing screenshot screen is minimized, try and catch block
 * 
 * 15. InvalidSelector exception - related to xpath or css due to incorrect syntax
 * 
 * 16. Invalid session id exception - if webdriver session is terminated when using web driver - try and catch
 * 
 * 17. Timeout exception - but related to only explicit wait - try and catch
 * 
 * 18. Insecure certitificate exception - related to ssl certificate - driver not able to open the website to due to insecure ceritification - pass the chrome options
 * 
 * 19. Invalid argument exception - if invalid argument passed to builtin methods example for timeout -ve time
 * 
 * 
 * 20. WebDriver exception - browser will not launch due to something gone wrong while creating instance like compatible version for new browser version or selenium version
 * 		try and catch block and update the versions manually
 *	
 * 21. SessionNot found exception - after quitting browser and performing further action
 * 
 * 22.
 */

public class SeleniumExceptions {

}
