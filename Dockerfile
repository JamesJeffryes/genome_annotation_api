FROM kbase/kbase:sdkbase2.latest
MAINTAINER KBase Developer

RUN pip install repoze.lru

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod -R a+rw /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
