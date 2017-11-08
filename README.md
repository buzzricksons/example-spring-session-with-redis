# Sample for Spring Session with Redis
Sample for session replication using spring session.

## Usage
1. Redis need to be ready.(localhost:6379)
2. Run SpringSessionReplicationApplication.(3 instance of tomcat started. Port number is `8880`, `8881`, `8882`)
3. Connect to `localhost:8880` or `localhost:8881` or `localhost:8882`. Below message printed.
```
current user: guest
```
4. Connect to `localhost:8880/login/?name=foobar`.Below message printed.
```
logined user: foobar (session ID: xxxxxxxxxxxxxxx)
```
5. Connect `localhost:8880` or `localhost:8881` or `localhost:8882`. Below message printed.
```
current user: foobar
```

## Reference
### Spring Session
- http://kimulla.hatenablog.com/entry/2016/03/06/%E7%B0%A1%E5%8D%98_Spring_Session%E3%81%A7KVS%E3%82%92%E7%94%A8%E3%81%84%E3%81%9F%E3%82%BB%E3%83%83%E3%82%B7%E3%83%A7%E3%83%B3%E3%82%B9%E3%83%88%E3%82%A2
- https://stackoverflow.com/questions/26111050/spring-boot-how-can-i-add-tomcat-connectors-to-bind-to-controller

### Redis(via Docker)
- https://github.com/zokeber/docker-redis
