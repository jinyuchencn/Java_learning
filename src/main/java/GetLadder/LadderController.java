package GetLadder;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LadderController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/Ladder")
    public String ladder1(@RequestParam(value="b",defaultValue="apple") String beginword,@RequestParam(value="e",defaultValue="happy") String endword){
        GetLadder A=new GetLadder();
        return A.Ladder(beginword,endword);
//        return  A;
    }
    @RequestMapping(value = "/Ladder/{beginword}/{endword}",method = RequestMethod.GET)
    public String ladder2(@PathVariable String beginword, @PathVariable String endword){
        GetLadder A=new GetLadder();
        return A.Ladder(beginword,endword);
//        return  A;
    }
//    @RequestMapping(value="/addUser4/{username}/{password}",method=RequestMethod.GET)
//    public String addUser4(@PathVariable String username,@PathVariable String password) {
//        System.out.println("username is:"+username);
//        System.out.println("password is:"+password);
//        return "demo/index";
//    }
//    }

}
