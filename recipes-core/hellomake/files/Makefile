all:
	$(CC) $(CFLAGS) $(LDFLAGS) hello.c -o hellomake

install:
	install -d $(DESTDIR)/usr/bin
	install -m 0755 hellomake $(DESTDIR)/usr/bin

