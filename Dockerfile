FROM kbase/kbase:sdkbase.latest
MAINTAINER KBase Developer
# -----------------------------------------

RUN pip install --upgrade ndg-httpsclient

RUN mkdir -p /kb/module && \
    cd /kb/module && \
    git clone https://github.com/kbase/workspace_deluxe && \
    cd workspace_deluxe && \
    git checkout b617106 && \
    rm -rf /kb/deployment/lib/biokbase/workspace && \
    cp -vr lib/biokbase/workspace /kb/deployment/lib/biokbase/workspace

RUN mkdir -p /kb/module && \
    cd /kb/module && \
    git clone https://github.com/kbase/data_api && \
    cd data_api && \
    git checkout && \
    cd /kb/module 69e2740 && \
    mkdir lib/

RUN pip install //kb/module/data_api

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod 777 /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
