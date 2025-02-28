create database thelibray;


CREATE TABLE image_links (
    id SERIAL PRIMARY KEY,
    small_thumbnail VARCHAR(255),
    thumbnail VARCHAR(255)
);
CREATE TABLE volume_info (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    published_date VARCHAR(50),
    description TEXT,
    page_count INTEGER,
    print_type VARCHAR(50),
    maturity_rating VARCHAR(50),
    allow_anon_logging BOOLEAN,
    content_version VARCHAR(50),
    book_language VARCHAR(10),
    preview_link VARCHAR(255),
    info_link VARCHAR(255),
    canonical_volume_link VARCHAR(255),
    image_links_id BIGINT UNIQUE REFERENCES image_links(id)
);

CREATE TABLE sale_info (
    id SERIAL PRIMARY KEY,
    country VARCHAR(10),
    saleability VARCHAR(50),
    is_ebook BOOLEAN
);

CREATE TABLE access_info (
    id SERIAL PRIMARY KEY,
    country VARCHAR(10),
    viewability VARCHAR(50),
    embeddable BOOLEAN,
    public_domain BOOLEAN,
    text_to_speech_permission VARCHAR(50),
    epub_available BOOLEAN,
    pdf_available BOOLEAN,
    web_reader_link VARCHAR(255),
    access_view_status VARCHAR(50),
    quote_sharing_allowed BOOLEAN
);
CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    kind VARCHAR(255),
    etag VARCHAR(255),
    self_link VARCHAR(255),
    volume_info_id BIGINT UNIQUE REFERENCES volume_info(id),
    sale_info_id BIGINT UNIQUE REFERENCES sale_info(id),
    access_info_id BIGINT UNIQUE REFERENCES access_info(id)
);


CREATE TABLE volume_authors (
    volume_info_id BIGINT REFERENCES volume_info(id),
    author VARCHAR(255)
);

CREATE TABLE industry_identifiers (
    id SERIAL PRIMARY KEY,
    type VARCHAR(50),
    identifier VARCHAR(50),
    volume_info_id BIGINT REFERENCES volume_info(id)
);


CREATE TABLE volume_categories (
        volume_info_id BIGINT REFERENCES volume_info(id),
        category VARCHAR(255)
);


